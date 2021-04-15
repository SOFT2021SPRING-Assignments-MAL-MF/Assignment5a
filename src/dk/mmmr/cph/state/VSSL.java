//package dk.mmmr.cph.state;
//
//public class VSSL {
//    public static void main(String[] args) {
//        State P = new MappedState("Y", new RangeValueSet(false, Integer.MIN_VALUE, Integer.MAX_VALUE)); // precondition
//        State Q = new MappedState("X", new RangeValueSet(false, Integer.MIN_VALUE, Integer.MAX_VALUE)); // postcondition
//
//        RangeValueSet endY1 = new RangeValueSet(false, 1, 19);
//        RangeValueSet endX1 = new RangeValueSet(false, 100,100);
//        RangeValueSet endY2 = new RangeValueSet(false, 20, 100);
//        RangeValueSet endX2 = new RangeValueSet(false, 4711,4711);
//
//        //P.
//
//        //SyntaxTree C = new SyntaxTree(...) // commands / code / program
//
//        //State S = C.analyse(P);
//
////        if (S.subStateOf(Q)) {
////            System.out.println("Hurra!");
////        } else{
////            System.out.println("Øv!");
////        }
//    }
//}
