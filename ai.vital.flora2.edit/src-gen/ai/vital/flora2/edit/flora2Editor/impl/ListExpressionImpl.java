/**
 */
package ai.vital.flora2.edit.flora2Editor.impl;

import ai.vital.flora2.edit.flora2Editor.Expression;
import ai.vital.flora2.edit.flora2Editor.Flora2EditorPackage;
import ai.vital.flora2.edit.flora2Editor.ListExpression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ai.vital.flora2.edit.flora2Editor.impl.ListExpressionImpl#getHead <em>Head</em>}</li>
 *   <li>{@link ai.vital.flora2.edit.flora2Editor.impl.ListExpressionImpl#getTail <em>Tail</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ListExpressionImpl extends ExpressionImpl implements ListExpression
{
  /**
   * The cached value of the '{@link #getHead() <em>Head</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHead()
   * @generated
   * @ordered
   */
  protected Expression head;

  /**
   * The cached value of the '{@link #getTail() <em>Tail</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTail()
   * @generated
   * @ordered
   */
  protected Expression tail;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Flora2EditorPackage.Literals.LIST_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getHead()
  {
    return head;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHead(Expression newHead, NotificationChain msgs)
  {
    Expression oldHead = head;
    head = newHead;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Flora2EditorPackage.LIST_EXPRESSION__HEAD, oldHead, newHead);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHead(Expression newHead)
  {
    if (newHead != head)
    {
      NotificationChain msgs = null;
      if (head != null)
        msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Flora2EditorPackage.LIST_EXPRESSION__HEAD, null, msgs);
      if (newHead != null)
        msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Flora2EditorPackage.LIST_EXPRESSION__HEAD, null, msgs);
      msgs = basicSetHead(newHead, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Flora2EditorPackage.LIST_EXPRESSION__HEAD, newHead, newHead));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression getTail()
  {
    return tail;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTail(Expression newTail, NotificationChain msgs)
  {
    Expression oldTail = tail;
    tail = newTail;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Flora2EditorPackage.LIST_EXPRESSION__TAIL, oldTail, newTail);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTail(Expression newTail)
  {
    if (newTail != tail)
    {
      NotificationChain msgs = null;
      if (tail != null)
        msgs = ((InternalEObject)tail).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Flora2EditorPackage.LIST_EXPRESSION__TAIL, null, msgs);
      if (newTail != null)
        msgs = ((InternalEObject)newTail).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Flora2EditorPackage.LIST_EXPRESSION__TAIL, null, msgs);
      msgs = basicSetTail(newTail, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Flora2EditorPackage.LIST_EXPRESSION__TAIL, newTail, newTail));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Flora2EditorPackage.LIST_EXPRESSION__HEAD:
        return basicSetHead(null, msgs);
      case Flora2EditorPackage.LIST_EXPRESSION__TAIL:
        return basicSetTail(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Flora2EditorPackage.LIST_EXPRESSION__HEAD:
        return getHead();
      case Flora2EditorPackage.LIST_EXPRESSION__TAIL:
        return getTail();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Flora2EditorPackage.LIST_EXPRESSION__HEAD:
        setHead((Expression)newValue);
        return;
      case Flora2EditorPackage.LIST_EXPRESSION__TAIL:
        setTail((Expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Flora2EditorPackage.LIST_EXPRESSION__HEAD:
        setHead((Expression)null);
        return;
      case Flora2EditorPackage.LIST_EXPRESSION__TAIL:
        setTail((Expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Flora2EditorPackage.LIST_EXPRESSION__HEAD:
        return head != null;
      case Flora2EditorPackage.LIST_EXPRESSION__TAIL:
        return tail != null;
    }
    return super.eIsSet(featureID);
  }

} //ListExpressionImpl
