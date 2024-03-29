/**
 * generated by Xtext 2.18.0
 */
package nl.wur.inf.safetyDSL.impl;

import java.util.Collection;

import nl.wur.inf.safetyDSL.ArchElementToArchElement;
import nl.wur.inf.safetyDSL.ArchitecturalElement;
import nl.wur.inf.safetyDSL.SafetyDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arch Element To Arch Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.wur.inf.safetyDSL.impl.ArchElementToArchElementImpl#getElement1 <em>Element1</em>}</li>
 *   <li>{@link nl.wur.inf.safetyDSL.impl.ArchElementToArchElementImpl#getElement2 <em>Element2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArchElementToArchElementImpl extends SafetyCriticalRelationImpl implements ArchElementToArchElement
{
  /**
   * The cached value of the '{@link #getElement1() <em>Element1</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement1()
   * @generated
   * @ordered
   */
  protected ArchitecturalElement element1;

  /**
   * The cached value of the '{@link #getElement2() <em>Element2</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement2()
   * @generated
   * @ordered
   */
  protected EList<ArchitecturalElement> element2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArchElementToArchElementImpl()
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
    return SafetyDSLPackage.Literals.ARCH_ELEMENT_TO_ARCH_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArchitecturalElement getElement1()
  {
    if (element1 != null && element1.eIsProxy())
    {
      InternalEObject oldElement1 = (InternalEObject)element1;
      element1 = (ArchitecturalElement)eResolveProxy(oldElement1);
      if (element1 != oldElement1)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SafetyDSLPackage.ARCH_ELEMENT_TO_ARCH_ELEMENT__ELEMENT1, oldElement1, element1));
      }
    }
    return element1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArchitecturalElement basicGetElement1()
  {
    return element1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setElement1(ArchitecturalElement newElement1)
  {
    ArchitecturalElement oldElement1 = element1;
    element1 = newElement1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SafetyDSLPackage.ARCH_ELEMENT_TO_ARCH_ELEMENT__ELEMENT1, oldElement1, element1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ArchitecturalElement> getElement2()
  {
    if (element2 == null)
    {
      element2 = new EObjectResolvingEList<ArchitecturalElement>(ArchitecturalElement.class, this, SafetyDSLPackage.ARCH_ELEMENT_TO_ARCH_ELEMENT__ELEMENT2);
    }
    return element2;
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
      case SafetyDSLPackage.ARCH_ELEMENT_TO_ARCH_ELEMENT__ELEMENT1:
        if (resolve) return getElement1();
        return basicGetElement1();
      case SafetyDSLPackage.ARCH_ELEMENT_TO_ARCH_ELEMENT__ELEMENT2:
        return getElement2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SafetyDSLPackage.ARCH_ELEMENT_TO_ARCH_ELEMENT__ELEMENT1:
        setElement1((ArchitecturalElement)newValue);
        return;
      case SafetyDSLPackage.ARCH_ELEMENT_TO_ARCH_ELEMENT__ELEMENT2:
        getElement2().clear();
        getElement2().addAll((Collection<? extends ArchitecturalElement>)newValue);
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
      case SafetyDSLPackage.ARCH_ELEMENT_TO_ARCH_ELEMENT__ELEMENT1:
        setElement1((ArchitecturalElement)null);
        return;
      case SafetyDSLPackage.ARCH_ELEMENT_TO_ARCH_ELEMENT__ELEMENT2:
        getElement2().clear();
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
      case SafetyDSLPackage.ARCH_ELEMENT_TO_ARCH_ELEMENT__ELEMENT1:
        return element1 != null;
      case SafetyDSLPackage.ARCH_ELEMENT_TO_ARCH_ELEMENT__ELEMENT2:
        return element2 != null && !element2.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ArchElementToArchElementImpl
