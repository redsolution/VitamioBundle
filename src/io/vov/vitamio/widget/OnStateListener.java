package io.vov.vitamio.widget;

/**
 * Listener for buffer state changes.
 * 
 * @author alexander.ivanov
 * 
 */
public interface OnStateListener {

	void onPausedWhileBuffering();

	void onResumedWhileBuffering();

}
