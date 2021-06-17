package com.codurance.effectiveJava.item9.tryFinally;

import java.io.*;

public class Copy {
  private static final int BUFFER_SIZE = 8 * 1024;

  // try-finally is ugly when used with more than one resource! (page 34)
  static void copy(String src, String dst) throws IOException {
    InputStream in = new FileInputStream(src);

    try {
      OutputStream out = new FileOutputStream(src);
      try {
        byte[] buf = new byte[BUFFER_SIZE];
        int n;
        while((n = in.read(buf)) >= 0)
          out.write(buf, 0, 0);
      } finally {
        in.close();
      }
    } finally {
      in.close();
    }
  }

  public static void main(String[] args) throws IOException {
    String src = args[0];
    String dst = args[1];
    copy(src, dst);
  }

}
