/**
 */
package org.panorama.research.waters2019.tracemetamodel.impl;

import org.eclipse.app4mc.amalthea.model.INamed;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.panorama.research.waters2019.tracemetamodel.RefinesTimingRequirement;
import org.panorama.research.waters2019.tracemetamodel.TracemetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refines Timing Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.panorama.research.waters2019.tracemetamodel.impl.RefinesTimingRequirementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.panorama.research.waters2019.tracemetamodel.impl.RefinesTimingRequirementImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefinesTimingRequirementImpl extends DirectedTraceLinkImpl implements RefinesTimingRequirement {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected INamed source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EObject target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefinesTimingRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TracemetamodelPackage.Literals.REFINES_TIMING_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public INamed getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (INamed)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracemetamodelPackage.REFINES_TIMING_REQUIREMENT__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public INamed basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(INamed newSource) {
		INamed oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemetamodelPackage.REFINES_TIMING_REQUIREMENT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TracemetamodelPackage.REFINES_TIMING_REQUIREMENT__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(EObject newTarget) {
		EObject oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TracemetamodelPackage.REFINES_TIMING_REQUIREMENT__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TracemetamodelPackage.REFINES_TIMING_REQUIREMENT__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case TracemetamodelPackage.REFINES_TIMING_REQUIREMENT__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TracemetamodelPackage.REFINES_TIMING_REQUIREMENT__SOURCE:
				setSource((INamed)newValue);
				return;
			case TracemetamodelPackage.REFINES_TIMING_REQUIREMENT__TARGET:
				setTarget((EObject)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case TracemetamodelPackage.REFINES_TIMING_REQUIREMENT__SOURCE:
				setSource((INamed)null);
				return;
			case TracemetamodelPackage.REFINES_TIMING_REQUIREMENT__TARGET:
				setTarget((EObject)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TracemetamodelPackage.REFINES_TIMING_REQUIREMENT__SOURCE:
				return source != null;
			case TracemetamodelPackage.REFINES_TIMING_REQUIREMENT__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //RefinesTimingRequirementImpl
