package ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;

public interface IOwnPrimaryKeyManager extends ch.actifsource.core.javamodel.INamedResource, ch.actifsource.solution.modelsnippet.primarykeymanager.javamodel.IBasePrimaryKeyManager {

  public static final ch.actifsource.core.INode TYPE_ID = new ch.actifsource.core.Resource("b508955a-bec7-11eb-a569-918f3c9a692e");
  
  // relations
  
  public java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.solution.modelsnippet.primarykeymanager.javamodel.IPrimaryKey> selectPrimaryKey();
  
}

/* Actifsource ID=[3ca9f967-db37-11de-82b8-17be2e034a3b,b508955a-bec7-11eb-a569-918f3c9a692e,CPpdyJUEEThqIvcOvkIGmMRvmD0=] */
