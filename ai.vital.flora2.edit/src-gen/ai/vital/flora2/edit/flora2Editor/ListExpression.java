/**
 */
package ai.vital.flora2.edit.flora2Editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ai.vital.flora2.edit.flora2Editor.ListExpression#getHead <em>Head</em>}</li>
 *   <li>{@link ai.vital.flora2.edit.flora2Editor.ListExpression#getTail <em>Tail</em>}</li>
 * </ul>
 *
 * @see ai.vital.flora2.edit.flora2Editor.Flora2EditorPackage#getListExpression()
 * @model
 * @generated
 */
public interface ListExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Head</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Head</em>' containment reference.
   * @see #setHead(Expression)
   * @see ai.vital.flora2.edit.flora2Editor.Flora2EditorPackage#getListExpression_Head()
   * @model containment="true"
   * @generated
   */
  Expression getHead();

  /**
   * Sets the value of the '{@link ai.vital.flora2.edit.flora2Editor.ListExpression#getHead <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Head</em>' containment reference.
   * @see #getHead()
   * @generated
   */
  void setHead(Expression value);

  /**
   * Returns the value of the '<em><b>Tail</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tail</em>' containment reference.
   * @see #setTail(Expression)
   * @see ai.vital.flora2.edit.flora2Editor.Flora2EditorPackage#getListExpression_Tail()
   * @model containment="true"
   * @generated
   */
  Expression getTail();

  /**
   * Sets the value of the '{@link ai.vital.flora2.edit.flora2Editor.ListExpression#getTail <em>Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tail</em>' containment reference.
   * @see #getTail()
   * @generated
   */
  void setTail(Expression value);

} // ListExpression
