///**
// * GLL1 is a Generic Linked List implementation <br>
// * modeled on DJW's code in our textbook
// *
// * @param <T> generic type parameter (any Object will qualify)
// */
//public class GLL1<T> implements IGLL<Boolean> {
//
//    private Boolean info;
//    private GLL1<T> next;
//
//    public GLL1(Boolean value) {
//        info = value;
//        next = null;
//    }
//
//    public Boolean getInfo() {
//        return info;
//    }
//
//    public void setInfo(Boolean info) {
//        this.info = info;
//    }
//
//    public GLL1<T> getNext() {
//        return next;
//    }
//
//    public void setNext(GLL1<T> next) {
//        this.next = next;
//    }
//
//    @Override
//    public void newHead(Boolean value) {
//        GLL1<T> node = new GLL1<>(info);
//        node.next = this.next;
//        this.next = node;
//        this.info = value;
//    }
//
//    @Override
//    public void newTail(Boolean value) {
//        GLL1<T> node = new GLL1<>(value);
//        GLL1<T> current = this;
//        while (current.next != null) {
//            current = current.next;
//        }
//        current.next = node;
//    }
//
//    @Override
//    public boolean decapitate() {
//        boolean success = false;
//
//        if (this.next != null) {
//            this.info = this.next.info;
//            this.next = this.next.next;
//            success = true;
//        }
//        return success;
//    }
//
//    @Override
//    public boolean secondectomy() {
//        // get the val of the second node
//        //point node1 to node3, node2 will get garbage collected
//       boolean success = false;
//        if (this.next != null) {
//            this.next = this.next.next;
//            success = true;
//        }
//        return success;
//    }
//
////    @Override
////    public boolean swap12() {
////        boolean success = false;
////        //as long as there is values to swap
////        if (this.next != null) {
////            //store two in a temp, perform standard value swap
////           T infoHolder = this.info;
////           this.info = this.next.info;
////           this.next.info = infoHolder;
////           success = true;
////        }
////        return success;
////    }
//
//    @Override
//    public Boolean caudectomy() {
//        boolean success = false;
//        if(this.next != null){
//            GLL1<T> curr = this;
//            while(curr.next.next != null){
//                curr = curr.next;
//            }
//            //exits once we are at the second to last node
//            //sets that pointer to null essentially leaving
//            //the last node hanging.
//            curr.next = null;
//            success = true;
//        }
//        return success;
//    }
//}
