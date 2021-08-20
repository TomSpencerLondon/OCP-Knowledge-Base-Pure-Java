package com.codurance.ocppracticeexam.exam1;

import java.io.File;
import java.security.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class TestAccessController {
  public static void main(String[] args) {

    TestAccessController testAccessController = new TestAccessController();
    testAccessController.dir = List.of(new File("test1.txt"), new File("test2.txt"));
    testAccessController.executeFunction(new Function<File, String>(){
      public String apply(File o) {
        return o.getName();
      }
    });
  }

  List<File> dir;
  public <R> List<R> executeFunction(Function<File, R> fun) {
    List<R> l = new ArrayList<R>();
    for (File f : dir) {
      Permission perm = new java.io.FilePermission(f.getPath(), "read");
      PermissionCollection perms = perm.newPermissionCollection();
      perms.add(perm);

      AccessController.doPrivileged(new PrivilegedAction<Void>() {
        public Void run() {
          l.add(fun.apply(f));
          return null;
        }},
          new AccessControlContext(
              new ProtectionDomain[] {
                  new ProtectionDomain(null, perms)
              }
          )
      );
    }
    return l;
  }
}
