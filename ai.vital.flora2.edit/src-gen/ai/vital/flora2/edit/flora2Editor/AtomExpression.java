/**
 */
package ai.vital.flora2.edit.flora2Editor;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atom Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ai.vital.flora2.edit.flora2Editor.AtomExpression#getAtom <em>Atom</em>}</li>
 *   <li>{@link ai.vital.flora2.edit.flora2Editor.AtomExpression#getTerms <em>Terms</em>}</li>
 * </ul>
 *
 * @see ai.vital.flora2.edit.flora2Editor.Flora2EditorPackage#getAtomExpression()
 * @model
 * @generated
 */
public interface AtomExpression extends Expression
{
  /**
   * Returns the value of the '<em><b>Atom</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Atom</em>' attribute.
   * @see #setAtom(String)
   * @see ai.vital.flora2.edit.flora2Editor.Flora2EditorPackage#getAtomExpression_Atom()
   * @model
   * @generated
   */
  String getAtom();

  /**
   * Sets the value of the '{@link ai.vital.flora2.edit.flora2Editor.AtomExpression#getAtom <em>Atom</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Atom</em>' attribute.
   * @see #getAtom()
   * @generated
   */
  void setAtom(String value);

  /**
   * Returns the value of the '<em><b>Terms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Terms</em>' containment reference.
   * @see #setTerms(Expression)
   * @see ai.vital.flora2.edit.flora2Editor.Flora2EditorPackage#getAtomExpression_Terms()
   * @model containment="true"
   * @generated
   */
  Expression getTerms();

  /**
   * Sets the value of the '{@link ai.vital.flora2.edit.flora2Editor.AtomExpression#getTerms <em>Terms</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Terms</em>' containment reference.
   * @see #getTerms()
   * @generated
   */
  void setTerms(Expression value);

} // AtomExpression
