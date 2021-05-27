package ch.actifsource.example.modelsnippet.primarykeymanager.example1.generic.javamodel;

import ch.actifsource.util.collection.IMultiMapOrdered;
import ch.actifsource.core.dynamic.*;

@edu.umd.cs.findbugs.annotations.SuppressWarnings("EQ_DOESNT_OVERRIDE_EQUALS")
public class MappingResource1 extends DynamicResource implements IMappingResource1 {

  public static final ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMappingResource1> FACTORY = new ch.actifsource.core.dynamic.IDynamicResource.IFactory<IMappingResource1>() {
    
    @Override
    public IMappingResource1 create() {
      return new MappingResource1();
    }
    
    @Override
    public IMappingResource1 create(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
      return new MappingResource1(resourceRepository, resource);
    }
  
  };

  public MappingResource1() {
    super(IMappingResource1.TYPE_ID);
  }
  
  public MappingResource1(IDynamicResourceRepository resourceRepository, ch.actifsource.core.Resource resource) {
    super(resourceRepository, resource, IMappingResource1.TYPE_ID);
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

  public MappingResource1 setTypeOf(ch.actifsource.core.javamodel.IClass typeOf) {
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
/* Actifsource ID=[4d723cb5-db37-11de-82b8-17be2e034a3b,7d35439d-98d5-11ea-8ef1-cb1cd2be9da3,jGSM5/2LTN3+U5MkeKDM03HXtJU=] */
