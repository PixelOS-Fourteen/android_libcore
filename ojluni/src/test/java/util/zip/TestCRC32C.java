/*
 * Copyright (c) 2014, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

// Android-added: package declaration
package test.java.util.zip;

import java.util.zip.CRC32C;

/**
 * @test @summary Check that CRC-32C returns the expected CRC value for the
 * string 123456789
 * http://reveng.sourceforge.net/crc-catalogue/all.htm#crc.cat.crc-32c
 * @build ChecksumBase
 * @run main TestCRC32C
 */

public class TestCRC32C {

    // Android-changed: add annotation and drop args for atest TestNG runner to run the test.
    @org.testng.annotations.Test
    public static void main(/*String[] args*/) {
        ChecksumBase.testAll(new CRC32C(), 0xE3069283L);
    }
}