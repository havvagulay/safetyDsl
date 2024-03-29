/**
 * generated by Xtext 2.18.0
 */
package nl.wur.inf.safetyDSL.impl;

import nl.wur.inf.safetyDSL.FaultTree;
import nl.wur.inf.safetyDSL.FaultTreeNode;
import nl.wur.inf.safetyDSL.SafetyDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fault Tree</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.wur.inf.safetyDSL.impl.FaultTreeImpl#getRootNode <em>Root Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FaultTreeImpl extends HazardElementImpl implements FaultTree
{
  /**
   * The cached value of the '{@link #getRootNode() <em>Root Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRootNode()
   * @generated
   * @ordered
   */
  protected FaultTreeNode rootNode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FaultTreeImpl()
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
    return SafetyDSLPackage.Literals.FAULT_TREE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FaultTreeNode getRootNode()
  {
    return rootNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRootNode(FaultTreeNode newRootNode, NotificationChain msgs)
  {
    FaultTreeNode oldRootNode = rootNode;
    rootNode = newRootNode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SafetyDSLPackage.FAULT_TREE__ROOT_NODE, oldRootNode, newRootNode);
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
  public void setRootNode(FaultTreeNode newRootNode)
  {
    if (newRootNode != rootNode)
    {
      NotificationChain msgs = null;
      if (rootNode != null)
        msgs = ((InternalEObject)rootNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SafetyDSLPackage.FAULT_TREE__ROOT_NODE, null, msgs);
      if (newRootNode != null)
        msgs = ((InternalEObject)newRootNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SafetyDSLPackage.FAULT_TREE__ROOT_NODE, null, msgs);
      msgs = basicSetRootNode(newRootNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SafetyDSLPackage.FAULT_TREE__ROOT_NODE, newRootNode, newRootNode));
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
      case SafetyDSLPackage.FAULT_TREE__ROOT_NODE:
        return basicSetRootNode(null, msgs);
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
      case SafetyDSLPackage.FAULT_TREE__ROOT_NODE:
        return getRootNode();
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
      case SafetyDSLPackage.FAULT_TREE__ROOT_NODE:
        setRootNode((FaultTreeNode)newValue);
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
      case SafetyDSLPackage.FAULT_TREE__ROOT_NODE:
        setRootNode((FaultTreeNode)null);
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
      case SafetyDSLPackage.FAULT_TREE__ROOT_NODE:
        return rootNode != null;
    }
    return super.eIsSet(featureID);
  }

} //FaultTreeImpl
