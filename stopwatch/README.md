Stopwatch tasks by Varit Assavavisidchai 5910545833

I ran the tasks on a DELL Vostro 14, and got these results:

Task	Time
Append 50,000 chars to String										1.857874 sec
Append 100,000 chars to String										7.786857 sec
Append 100,000 chars to StringBuilder								0.003901 sec
Sum array of double primitives with count=1,000,000,000				2.162286 sec
Sum array of Double objects with count=1,000,000,000				13.839606 sec
Sum array of BigDecimal with count=1,000,000,000					17.136690 sec

Explanation of Results
•	Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars?
Ans Because When we append new chars to String. They will recollect string again.
•	Why is appending to StringBuilder so much different than appending to String?  What is happening to the String?
Ans	Because StringBuilder collect characters in array type. Exp Varit it's mean Box1 = V, Box2 = a , Box3 = r, Box4 = i,
	Box5 = t. and the box will increase while chars more than box. StringBuilder will create twice of their own box. 
	But String they will recreate every time that you add new characters. 
•	Explain difference in time to sum double, Double, and BigDecimal.  Which is faster and why?
Ans	double is the most fastest. then Double and  BigDecimal is the most slowest.
	Exp. If I create double, Double, BigDecimal. All that equals 1.234234234234234234234234234
		 And write System.out.print(); It will show like this
		 double: 1.2342342342342342
		 Double: 1.2342342342342342
		 BigDecimal: 1.234234234234234234234234234
	From the Results. double and Double have the limit Digits but BigDecimal can store all of it. So double is faster than Double 
	because double is primitive. BigDecimal is the most slowest because it must take more time to store and call it.
		 
		





