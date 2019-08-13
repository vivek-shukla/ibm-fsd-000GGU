package comm.innerClass;

import comm.innerClass.OuterClass.InnerClass;

public class InnerClassMain {
    public static void main(String[] args)
    {
    	OuterClass ocObj = new OuterClass(5,8);
    	ocObj.outerMethod();
    	InnerClass obj2 = ocObj.new InnerClass();
    	OuterClass.InnerClass icObj = ocObj.new InnerClass();
    	icObj.innerMethod();
//    	OuterClass.InnerClass.InsideInnerClass insideInnerObj = ocObj.icObj.new InsideInnerClass();
    	InnerClass.InsideInnerClass insideInnerObj = icObj.new InsideInnerClass();
    	insideInnerObj.insideInnerMethod();
    	
    }
}
