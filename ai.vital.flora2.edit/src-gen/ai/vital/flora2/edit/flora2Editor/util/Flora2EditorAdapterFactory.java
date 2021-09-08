/**
 */
package ai.vital.flora2.edit.flora2Editor.util;

import ai.vital.flora2.edit.flora2Editor.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ai.vital.flora2.edit.flora2Editor.Flora2EditorPackage
 * @generated
 */
public class Flora2EditorAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static Flora2EditorPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Flora2EditorAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = Flora2EditorPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Flora2EditorSwitch<Adapter> modelSwitch =
    new Flora2EditorSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseUnaryExpression(UnaryExpression object)
      {
        return createUnaryExpressionAdapter();
      }
      @Override
      public Adapter caseAtomExpression(AtomExpression object)
      {
        return createAtomExpressionAdapter();
      }
      @Override
      public Adapter caseVariableExpression(VariableExpression object)
      {
        return createVariableExpressionAdapter();
      }
      @Override
      public Adapter caseStringExpression(StringExpression object)
      {
        return createStringExpressionAdapter();
      }
      @Override
      public Adapter caseNumberExpression(NumberExpression object)
      {
        return createNumberExpressionAdapter();
      }
      @Override
      public Adapter caseListExpression(ListExpression object)
      {
        return createListExpressionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link ai.vital.flora2.edit.flora2Editor.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ai.vital.flora2.edit.flora2Editor.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ai.vital.flora2.edit.flora2Editor.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ai.vital.flora2.edit.flora2Editor.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ai.vital.flora2.edit.flora2Editor.UnaryExpression <em>Unary Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ai.vital.flora2.edit.flora2Editor.UnaryExpression
   * @generated
   */
  public Adapter createUnaryExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ai.vital.flora2.edit.flora2Editor.AtomExpression <em>Atom Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ai.vital.flora2.edit.flora2Editor.AtomExpression
   * @generated
   */
  public Adapter createAtomExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ai.vital.flora2.edit.flora2Editor.VariableExpression <em>Variable Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ai.vital.flora2.edit.flora2Editor.VariableExpression
   * @generated
   */
  public Adapter createVariableExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ai.vital.flora2.edit.flora2Editor.StringExpression <em>String Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ai.vital.flora2.edit.flora2Editor.StringExpression
   * @generated
   */
  public Adapter createStringExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ai.vital.flora2.edit.flora2Editor.NumberExpression <em>Number Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ai.vital.flora2.edit.flora2Editor.NumberExpression
   * @generated
   */
  public Adapter createNumberExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link ai.vital.flora2.edit.flora2Editor.ListExpression <em>List Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see ai.vital.flora2.edit.flora2Editor.ListExpression
   * @generated
   */
  public Adapter createListExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //Flora2EditorAdapterFactory
