/**
 * generated by Xtext 2.18.0
 */
package nl.wur.inf.safetyDSL.impl;

import nl.wur.inf.safetyDSL.Fault;
import nl.wur.inf.safetyDSL.FaultTreeNode;
import nl.wur.inf.safetyDSL.SafetyDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Tree Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.wur.inf.safetyDSL.impl.FaultTreeNodeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link nl.wur.inf.safetyDSL.impl.FaultTreeNodeImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link nl.wur.inf.safetyDSL.impl.FaultTreeNodeImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FaultTreeNodeImpl extends MinimalEObjectImpl.Container implements FaultTreeNode
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Fault value;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected FaultTreeNode left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected FaultTreeNode right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FaultTreeNodeImpl()
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
    return SafetyDSLPackage.Literals.FAULT_TREE_NODE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Fault getValue()
  {
    if (value != null && value.eIsProxy())
    {
      InternalEObject oldValue = (InternalEObject)value;
      value = (Fault)eResolveProxy(oldValue);
      if (value != oldValue)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SafetyDSLPackage.FAULT_TREE_NODE__VALUE, oldValue, value));
      }
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fault basicGetValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(Fault newValue)
  {
    Fault oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SafetyDSLPackage.FAULT_TREE_NODE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FaultTreeNode getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(FaultTreeNode newLeft, NotificationChain msgs)
  {
    FaultTreeNode oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SafetyDSLPackage.FAULT_TREE_NODE__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLeft(FaultTreeNode newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SafetyDSLPackage.FAULT_TREE_NODE__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SafetyDSLPackage.FAULT_TREE_NODE__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SafetyDSLPackage.FAULT_TREE_NODE__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FaultTreeNode getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(FaultTreeNode newRight, NotificationChain msgs)
  {
    FaultTreeNode oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SafetyDSLPackage.FAULT_TREE_NODE__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRight(FaultTreeNode newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SafetyDSLPackage.FAULT_TREE_NODE__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SafetyDSLPackage.FAULT_TREE_NODE__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SafetyDSLPackage.FAULT_TREE_NODE__RIGHT, newRight, newRight));
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
      case SafetyDSLPackage.FAULT_TREE_NODE__LEFT:
        return basicSetLeft(null, msgs);
      case SafetyDSLPackage.FAULT_TREE_NODE__RIGHT:
        return basicSetRight(null, msgs);
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
      case SafetyDSLPackage.FAULT_TREE_NODE__VALUE:
        if (resolve) return getValue();
        return basicGetValue();
      case SafetyDSLPackage.FAULT_TREE_NODE__LEFT:
        return getLeft();
      case SafetyDSLPackage.FAULT_TREE_NODE__RIGHT:
        return getRight();
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
      case SafetyDSLPackage.FAULT_TREE_NODE__VALUE:
        setValue((Fault)newValue);
        return;
      case SafetyDSLPackage.FAULT_TREE_NODE__LEFT:
        setLeft((FaultTreeNode)newValue);
        return;
      case SafetyDSLPackage.FAULT_TREE_NODE__RIGHT:
        setRight((FaultTreeNode)newValue);
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
      case SafetyDSLPackage.FAULT_TREE_NODE__VALUE:
        setValue((Fault)null);
        return;
      case SafetyDSLPackage.FAULT_TREE_NODE__LEFT:
        setLeft((FaultTreeNode)null);
        return;
      case SafetyDSLPackage.FAULT_TREE_NODE__RIGHT:
        setRight((FaultTreeNode)null);
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
      case SafetyDSLPackage.FAULT_TREE_NODE__VALUE:
        return value != null;
      case SafetyDSLPackage.FAULT_TREE_NODE__LEFT:
        return left != null;
      case SafetyDSLPackage.FAULT_TREE_NODE__RIGHT:
        return right != null;
    }
    return super.eIsSet(featureID);
  }

} //FaultTreeNodeImpl
