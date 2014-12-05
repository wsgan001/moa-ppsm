package moa.streams.filters.privacy.estimators;

/**
 * Generic privacy filter estimator.
 */
public interface FilterEstimator {

	/**
	 * Restarts this estimator, preparing it for next use.
	 * <p>
	 * All classes implementing some kind of estimation
	 * must be able to restart the estimator.
	 */
	public void restart();
	
}
