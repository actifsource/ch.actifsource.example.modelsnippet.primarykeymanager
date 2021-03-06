package ch.actifsource.example.modelsnippet.primarykeymanager.example2.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MappingResource2 extends DynamicResource implements IMappingResource2 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMappingResource2> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMappingResource2>() {
    
    @Override
    public IMappingResource2 create() {
      return new MappingResource2();
    }
    
    @Override
    public IMappingResource2 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MappingResource2(resourceRepository, resource);
    }
  
  };

  public MappingResource2() {
    super(IMappingResource2.TYPE_ID);
  }
  
  public MappingResource2(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMappingResource2.TYPE_ID);
  }

  // attributes
  
  @Override
  public java.lang.String selectName() {
    return _getSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name);
  }
    
  public void setName(java.lang.String name) {
     _setSingleAttribute(ch.actifsource.core.CorePackage.NamedResource_name, name);
  }

  // relations
  
  @Override
  public ch.actifsource.core.javamodel.IClass selectTypeOf() {
    return _getSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf);
  }

  public MappingResource2 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
    _setSingle(ch.actifsource.core.CorePackage.Resource_typeOf, typeOf);
    return this;
  }
    
  // accept property value visitor
  @Override
  public void accept(IPropertyValueVisitor visitor) {
    // attributes
    _acceptSingleAttribute(java.lang.String.class, ch.actifsource.core.CorePackage.NamedResource_name, visitor);
    // relations
    _acceptSingle(ch.actifsource.core.javamodel.IClass.class, ch.actifsource.core.CorePackage.Resource_typeOf, visitor);
  }

}
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,f5be3f27-bec6-11eb-a569-918f3c9a692e,Pv5YBGIlztLxdSeHpoyEjcSYEKY=] */
