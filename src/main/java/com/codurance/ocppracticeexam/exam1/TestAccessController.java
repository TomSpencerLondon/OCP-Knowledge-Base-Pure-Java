package com.codurance.ocppracticeexam.exam1;
import java.io.File;
import java.security.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestAccessController {
    public static void main(String[] args) {

        TestAccessController testAccessController = new TestAccessController();
        testAccessController.dir = List.of(new File("/tmp/test1.txt"));
        System.out.println(testAccessController.executeFunction(new Function<File, Boolean>() {
            public Boolean apply(File o) {
                System.out.println(o.getAbsolutePath());
                System.out.println(o.exists());
                return o.delete();
            }
        }));
    }

    List<File> dir;

    public <R> List<R> executeFunction(Function<File, R> fun) {
        List<R> l = new ArrayList<R>();
        for (File f : dir) {
            System.out.println(f.getAbsolutePath());
            Permission perm = new java.io.FilePermission(f.getAbsolutePath(), "read,delete");
            PermissionCollection perms = perm.newPermissionCollection();
            perms.add(perm);

            AccessController.doPrivileged(new PrivilegedAction<Void>() {
                                              public Void run() {
                                                  l.add(fun.apply(f));
                                                  return null;
                                              }
                                          },
                    new AccessControlContext(
                            new ProtectionDomain[]{
                                    new ProtectionDomain(null, perms)
                            }
                    )
            );
        }
        return l;
    }
}