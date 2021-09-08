/**
 */
package ai.vital.flora2.edit.flora2Editor.impl;

import ai.vital.flora2.edit.flora2Editor.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Flora2EditorFactoryImpl extends EFactoryImpl implements Flora2EditorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Flora2EditorFactory init()
  {
    try
    {
      Flora2EditorFactory theFlora2EditorFactory = (Flora2EditorFactory)EPackage.Registry.INSTANCE.getEFactory(Flora2EditorPackage.eNS_URI);
      if (theFlora2EditorFactory != null)
      {
        return theFlora2EditorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Flora2EditorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flora2EditorFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Flora2EditorPackage.MODEL: return createModel();
      case Flora2EditorPackage.EXPRESSION: return createExpression();
      case Flora2EditorPackage.UNARY_EXPRESSION: return createUnaryExpression();
      case Flora2EditorPackage.ATOM_EXPRESSION: return createAtomExpression();
      case Flora2EditorPackage.VARIABLE_EXPRESSION: return createVariableExpression();
      case Flora2EditorPackage.STRING_EXPRESSION: return createStringExpression();
      case Flora2EditorPackage.NUMBER_EXPRESSION: return createNumberExpression();
      case Flora2EditorPackage.LIST_EXPRESSION: return createListExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnaryExpression createUnaryExpression()
  {
    UnaryExpressionImpl unaryExpression = new UnaryExpressionImpl();
    return unaryExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomExpression createAtomExpression()
  {
    AtomExpressionImpl atomExpression = new AtomExpressionImpl();
    return atomExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableExpression createVariableExpression()
  {
    VariableExpressionImpl variableExpression = new VariableExpressionImpl();
    return variableExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringExpression createStringExpression()
  {
    StringExpressionImpl stringExpression = new StringExpressionImpl();
    return stringExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberExpression createNumberExpression()
  {
    NumberExpressionImpl numberExpression = new NumberExpressionImpl();
    return numberExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListExpression createListExpression()
  {
    ListExpressionImpl listExpression = new ListExpressionImpl();
    return listExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flora2EditorPackage getFlora2EditorPackage()
  {
    return (Flora2EditorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Flora2EditorPackage getPackage()
  {
    return Flora2EditorPackage.eINSTANCE;
  }

} //Flora2EditorFactoryImpl
