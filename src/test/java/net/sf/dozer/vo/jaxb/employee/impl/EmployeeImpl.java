//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.4-b18-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2006.10.05 at 10:03:40 CEST 
//

package net.sf.dozer.vo.jaxb.employee.impl;

public class EmployeeImpl extends net.sf.dozer.vo.jaxb.employee.impl.EmployeeTypeImpl implements
    net.sf.dozer.vo.jaxb.employee.Employee, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject,
    net.sf.dozer.vo.jaxb.employee.impl.runtime.UnmarshallableObject,
    net.sf.dozer.vo.jaxb.employee.impl.runtime.XMLSerializable,
    net.sf.dozer.vo.jaxb.employee.impl.runtime.ValidatableObject {

  public final static java.lang.Class version = (net.sf.dozer.vo.jaxb.employee.impl.JAXBVersion.class);
  private static com.sun.msv.grammar.Grammar schemaFragment;

  private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
    return (net.sf.dozer.vo.jaxb.employee.Employee.class);
  }

  public java.lang.String ____jaxb_ri____getNamespaceURI() {
    return "http://jaxb.vo.mapping.util.dozer.sf.net/Employee";
  }

  public java.lang.String ____jaxb_ri____getLocalName() {
    return "Employee";
  }

  public net.sf.dozer.vo.jaxb.employee.impl.runtime.UnmarshallingEventHandler createUnmarshaller(
      net.sf.dozer.vo.jaxb.employee.impl.runtime.UnmarshallingContext context) {
    return new net.sf.dozer.vo.jaxb.employee.impl.EmployeeImpl.Unmarshaller(context);
  }

  public void serializeBody(net.sf.dozer.vo.jaxb.employee.impl.runtime.XMLSerializer context)
      throws org.xml.sax.SAXException {
    context.startElement("http://jaxb.vo.mapping.util.dozer.sf.net/Employee", "Employee");
    super.serializeURIs(context);
    context.endNamespaceDecls();
    super.serializeAttributes(context);
    context.endAttributes();
    super.serializeBody(context);
    context.endElement();
  }

  public void serializeAttributes(net.sf.dozer.vo.jaxb.employee.impl.runtime.XMLSerializer context)
      throws org.xml.sax.SAXException {
  }

  public void serializeURIs(net.sf.dozer.vo.jaxb.employee.impl.runtime.XMLSerializer context)
      throws org.xml.sax.SAXException {
  }

  public java.lang.Class getPrimaryInterface() {
    return (net.sf.dozer.vo.jaxb.employee.Employee.class);
  }

  public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
    if (schemaFragment == null) {
      schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer
          .deserialize(("\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
              + "\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
              + "grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
              + "\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
              + "msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
              + "ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
              + "mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
              + "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
              + "q\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000"
              + "\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000"
              + "\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004ppsr\u0000#com.sun.msv.dataty"
              + "pe.xsd.StringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxr\u0000*com.sun.msv."
              + "datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.dat"
              + "atype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xs"
              + "d.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUrit\u0000\u0012Ljava/lang/Stri"
              + "ng;L\u0000\btypeNameq\u0000~\u0000\u0016L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd"
              + "/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000"
              + "\u0006stringsr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Pres"
              + "erve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProces"
              + "sor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp\u0001sr\u00000com.sun.msv.grammar.Expression$NullSetE"
              + "xpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004ppsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0"
              + "t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0016L\u0000\fnamespaceURIq\u0000~\u0000\u0016xpq\u0000~\u0000\u001aq\u0000~\u0000\u0019s"
              + "r\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsr\u0000 com.s"
              + "un.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClas"
              + "sq\u0000~\u0000\u0001xq\u0000~\u0000\u0004sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~"
              + "\u0000\u000eppsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0013q"
              + "\u0000~\u0000\u0019t\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor"
              + "$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u001cq\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000+q\u0000~\u0000\u0019sr\u0000#com.sun.m"
              + "sv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\u0016L\u0000\fnam"
              + "espaceURIq\u0000~\u0000\u0016xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xp"
              + "t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instancesr\u00000com.s"
              + "un.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004"
              + "sq\u0000~\u0000&\u0001psq\u0000~\u0000/t\u0000\tFirstNamet\u0000\u0000sq\u0000~\u0000\"ppsq\u0000~\u0000\u0000q\u0000~\u0000\'p\u0000sq\u0000~\u0000\u0007ppsq"
              + "\u0000~\u0000\u000eppsr\u0000!com.sun.msv.datatype.xsd.DateType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)co"
              + "m.sun.msv.datatype.xsd.DateTimeBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xq\u0000~\u0000\u0013q\u0000~\u0000"
              + "\u0019t\u0000\u0004dateq\u0000~\u0000-q\u0000~\u0000\u001fsq\u0000~\u0000 q\u0000~\u0000Aq\u0000~\u0000\u0019sq\u0000~\u0000\"ppsq\u0000~\u0000$q\u0000~\u0000\'pq\u0000~\u0000(q"
              + "\u0000~\u00001q\u0000~\u00005sq\u0000~\u0000/t\u0000\tBirthDateq\u0000~\u00009q\u0000~\u00005sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000\u0011s"
              + "q\u0000~\u0000\"ppsq\u0000~\u0000$q\u0000~\u0000\'pq\u0000~\u0000(q\u0000~\u00001q\u0000~\u00005sq\u0000~\u0000/t\u0000\bLastNameq\u0000~\u00009sq\u0000~"
              + "\u0000\"ppsq\u0000~\u0000$q\u0000~\u0000\'pq\u0000~\u0000(q\u0000~\u00001q\u0000~\u00005sq\u0000~\u0000/t\u0000\bEmployeet\u00001http://ja"
              + "xb.vo.mapping.util.dozer.sf.net/Employeesr\u0000\"com.sun.msv.gram"
              + "mar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/gram"
              + "mar/ExpressionPool$ClosedHash;xpsr\u0000-com.sun.msv.grammar.Expr"
              + "essionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006p"
              + "arentt\u0000$Lcom/sun/msv/grammar/ExpressionPool;xp\u0000\u0000\u0000\u000b\u0001pq\u0000~\u0000<q\u0000~"
              + "\u0000\nq\u0000~\u0000:q\u0000~\u0000#q\u0000~\u0000Cq\u0000~\u0000Iq\u0000~\u0000Mq\u0000~\u0000\rq\u0000~\u0000Hq\u0000~\u0000\tq\u0000~\u0000\u000bx"));
    }
    return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
  }

  public class Unmarshaller extends net.sf.dozer.vo.jaxb.employee.impl.runtime.AbstractUnmarshallingEventHandlerImpl {

    public Unmarshaller(net.sf.dozer.vo.jaxb.employee.impl.runtime.UnmarshallingContext context) {
      super(context, "----");
    }

    protected Unmarshaller(net.sf.dozer.vo.jaxb.employee.impl.runtime.UnmarshallingContext context, int startState) {
      this(context);
      state = startState;
    }

    public java.lang.Object owner() {
      return net.sf.dozer.vo.jaxb.employee.impl.EmployeeImpl.this;
    }

    public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname,
        org.xml.sax.Attributes __atts) throws org.xml.sax.SAXException {
      int attIdx;
      outer: while (true) {
        switch (state) {
        case 0:
          if (("Employee" == ___local) && ("http://jaxb.vo.mapping.util.dozer.sf.net/Employee" == ___uri)) {
            context.pushAttributes(__atts, false);
            state = 1;
            return;
          }
          break;
        case 1:
          if (("FirstName" == ___local) && ("" == ___uri)) {
            spawnHandlerFromEnterElement(
                (((net.sf.dozer.vo.jaxb.employee.impl.EmployeeTypeImpl) net.sf.dozer.vo.jaxb.employee.impl.EmployeeImpl.this).new Unmarshaller(
                    context)), 2, ___uri, ___local, ___qname, __atts);
            return;
          }
          break;
        case 3:
          revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
          return;
        }
        super.enterElement(___uri, ___local, ___qname, __atts);
        break;
      }
    }

    public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
        throws org.xml.sax.SAXException {
      int attIdx;
      outer: while (true) {
        switch (state) {
        case 3:
          revertToParentFromLeaveElement(___uri, ___local, ___qname);
          return;
        case 2:
          if (("Employee" == ___local) && ("http://jaxb.vo.mapping.util.dozer.sf.net/Employee" == ___uri)) {
            context.popAttributes();
            state = 3;
            return;
          }
          break;
        }
        super.leaveElement(___uri, ___local, ___qname);
        break;
      }
    }

    public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
        throws org.xml.sax.SAXException {
      int attIdx;
      outer: while (true) {
        switch (state) {
        case 3:
          revertToParentFromEnterAttribute(___uri, ___local, ___qname);
          return;
        }
        super.enterAttribute(___uri, ___local, ___qname);
        break;
      }
    }

    public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
        throws org.xml.sax.SAXException {
      int attIdx;
      outer: while (true) {
        switch (state) {
        case 3:
          revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
          return;
        }
        super.leaveAttribute(___uri, ___local, ___qname);
        break;
      }
    }

    public void handleText(final java.lang.String value) throws org.xml.sax.SAXException {
      int attIdx;
      outer: while (true) {
        try {
          switch (state) {
          case 3:
            revertToParentFromText(value);
            return;
          }
        } catch (java.lang.RuntimeException e) {
          handleUnexpectedTextException(value, e);
        }
        break;
      }
    }

  }

}