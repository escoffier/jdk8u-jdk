/*
 * Copyright (c) 1997, 2003, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
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


/* Generated By:JJTree: Do not edit this line. JDMTrapBlock.java */

package com.sun.jmx.snmp.IPAcl;

import java.util.Hashtable;

class JDMTrapBlock extends SimpleNode {
  JDMTrapBlock(int id) {
    super(id);
  }

  JDMTrapBlock(Parser p, int id) {
    super(p, id);
  }

  public static Node jjtCreate(int id) {
      return new JDMTrapBlock(id);
  }

  public static Node jjtCreate(Parser p, int id) {
      return new JDMTrapBlock(p, id);
  }

  /**
   * Do no need to go through this part of the tree for
   * building AclEntry.
   */
   public void buildAclEntries(PrincipalImpl owner, AclImpl acl) {}

  /**
   * Do no need to go through this part of the tree for
   * building InformEntry.
   */
   public void buildInformEntries(Hashtable dest) {}
}
