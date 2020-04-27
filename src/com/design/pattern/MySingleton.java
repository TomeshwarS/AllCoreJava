package com.design.pattern;

public class MySingleton implements Runnable {

	@Override
	public void run() {

		getObject();
	}

	static MySingleton mySingleton = null;

	// t1
	private static MySingleton getObject() {
		System.out.println("start Excec " + Thread.currentThread().getName());

		// t1 t2
		synchronized (MySingleton.class) {

			if (mySingleton == null) {

				// t1 sleep

				if (mySingleton == null) {

					mySingleton = new MySingleton();

				}

			} else {
				mySingleton = mySingleton;
			}
		}
		System.out.println("end Excec " + Thread.currentThread().getName());
		return mySingleton;

	}

	public static void main(String[] args) {

		System.out.println(MySingleton.getObject().hashCode());
		System.out.println(MySingleton.getObject().hashCode());
		System.out.println(MySingleton.getObject().hashCode());
		System.out.println(MySingleton.getObject().hashCode());
		System.out.println(MySingleton.getObject().hashCode());

	}

}
