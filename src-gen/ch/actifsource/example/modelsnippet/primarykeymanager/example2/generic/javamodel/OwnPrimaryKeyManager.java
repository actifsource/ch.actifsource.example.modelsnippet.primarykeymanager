package ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class OwnPrimaryKeyManager extends DynamicResource implements IOwnPrimaryKeyManager {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOwnPrimaryKeyManager> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IOwnPrimaryKeyManager>() {
    
    @Override
    public IOwnPrimaryKeyManager create() {
      return new OwnPrimaryKeyManager();
    }
    
    @Override
    public IOwnPrimaryKeyManager create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new OwnPrimaryKeyManager(resourceRepository, resource);
    }
  
  };

  public OwnPrimaryKeyManager() {
    super(IOwnPrimaryKeyManager.TYPE_ID);
  }
  
  public OwnPrimaryKeyManager(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IOwnPrimaryKeyManager.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.Integer selectDefaultPrimaryKey() {
    return _getSingleAttribute(java.lang.Integer.class, ch.actifsource.solution.modelsnippet.primarykeymanager.PrimarykeymanagerPackage.BasePrimaryKeyManager_defaultPrimaryKey);
  }
    
  public void setDefaultPrimaryKey(java.lang.Integer defaultPrimaryKey) {
     _setSingleAttribute(ch.actifsource.solution.modelsnippet.primarykeymanager.PrimarykeymanagerPackage.BasePrimaryKeyManager_defaultPrimaryKey, defaultPrimaryKey);
  }

  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  @Override
  public java.lang.Integer selectNextPrimaryKey() {
    return _getSingleAttribute(java.lang.Integer.class, ch.actifsource.solution.modelsnippet.primarykeymanager.PrimarykeymanagerPackage.BasePrimaryKeyManager_nextPrimaryKey);
  }
    
  public void setNextPrimaryKey(java.lang.Integer nextPrimaryKey) {
     _setSingleAttribute(ch.actifsource.solution.modelsnippet.primarykeymanager.PrimarykeymanagerPackage.BasePrimaryKeyManager_nextPrimaryKey, nextPrimaryKey);
  }

  // relations
  
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.solution.modelsnippet.primarykeymanager.javamodel.IBasePrimaryKey> selectBasePrimaryKey() {
    return _getMap(ch.actifsource.solution.modelsnippet.primarykeymanager.javamodel.IBasePrimaryKey.class, ch.actifsource.solution.modelsnippet.primarykeymanager.PrimarykeymanagerPackage.BasePrimaryKeyManager_basePrimaryKey);
  }

  public OwnPrimaryKeyManager setBasePrimaryKey(java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.solution.modelsnippet.primarykeymanager.javamodel.IBasePrimaryKey> basePrimaryKey) {
    _setMap(ch.actifsource.solution.modelsnippet.primarykeymanager.PrimarykeymanagerPackage.BasePrimaryKeyManager_basePrimaryKey, basePrimaryKey);
    return this;
  }
    
  @Override
  public java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.solution.modelsnippet.primarykeymanager.javamodel.IPrimaryKey> selectPrimaryKey() {
    return _getMap(ch.actifsource.solution.modelsnippet.primarykeymanager.javamodel.IPrimaryKey.class, ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.GenericPackage.OwnPrimaryKeyManager_primaryKey);
  }

  public OwnPrimaryKeyManager setPrimaryKey(java.util.Map<ch.actifsource.core.Resource, ? extends ch.actifsource.solution.modelsnippet.primarykeymanager.javamodel.IPrimaryKey> primaryKey) {
    _setMap(ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.GenericPackage.OwnPrimaryKeyManager_primaryKey, primaryKey);
    return this;
  }
    
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public OwnPrimaryKeyManager setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.Integer.class, ch.actifsource.solution.modelsnippet.primarykeymanager.PrimarykeymanagerPackage.BasePrimaryKeyManager_defaultPrimaryKey, visitor);
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    _acceptSingleAttribute(java.lang.Integer.class, ch.actifsource.solution.modelsnippet.primarykeymanager.PrimarykeymanagerPackage.BasePrimaryKeyManager_nextPrimaryKey, visitor);
    // relations
    _acceptMap(ch.actifsource.solution.modelsnippet.primarykeymanager.javamodel.IPrimaryKey.class, ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.GenericPackage.OwnPrimaryKeyManager_primaryKey, visitor);
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

  // toMeRelations
  
  public static ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.javamodel.IOwnPrimaryKeyManager selectToMePrimaryKey(ch.actifsource.solution.modelsnippet.primarykeymanager.javamodel.IPrimaryKey object) {
    return _getToMeSingle(object.getRepository(), ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.javamodel.IOwnPrimaryKeyManager.class, ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.GenericPackage.OwnPrimaryKeyManager_primaryKey, object.getResource());
  }
  
}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,b508955a-bec7-11eb-a569-918f3c9a692e,Z1Fr7o63GRKR2ZRx2kVtiTZwuyE=] */
