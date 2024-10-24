package _14StringBufferAndStringBuilder;

import _15Threads._1stT;
import _15Threads._2ndT;

public class _4forExecution {

	public static void main(String[] args) {

		_1stT t1= new _1stT();
        _2ndT t2= new _2ndT();
		_3rdT t3= new _3rdT();
		
		
		t1.start();
		t2.start();
		t3.start();



	}

}
