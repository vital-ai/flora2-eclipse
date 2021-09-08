/**
 */
package ai.vital.flora2.edit.flora2Editor;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ai.vital.flora2.edit.flora2Editor.Flora2EditorPackage
 * @generated
 */
public interface Flora2EditorFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Flora2EditorFactory eINSTANCE = ai.vital.flora2.edit.flora2Editor.impl.Flora2EditorFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Unary Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unary Expression</em>'.
   * @generated
   */
  UnaryExpression createUnaryExpression();

  /**
   * Returns a new object of class '<em>Atom Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atom Expression</em>'.
   * @generated
   */
  AtomExpression createAtomExpression();

  /**
   * Returns a new object of class '<em>Variable Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Expression</em>'.
   * @generated
   */
  VariableExpression createVariableExpression();

  /**
   * Returns a new object of class '<em>String Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Expression</em>'.
   * @generated
   */
  StringExpression createStringExpression();

  /**
   * Returns a new object of class '<em>Number Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Expression</em>'.
   * @generated
   */
  NumberExpression createNumberExpression();

  /**
   * Returns a new object of class '<em>List Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Expression</em>'.
   * @generated
   */
  ListExpression createListExpression();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Flora2EditorPackage getFlora2EditorPackage();

} //Flora2EditorFactory
