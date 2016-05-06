/**
 * Created by Administrator on 2016/5/6 0006.
 */
define("com/domeastudio/mappingo/util/DoublyLinkedList",[],function () {
    var createNew=function(){
        var doublyLinkedList={};
        var Node=function(element){
            this.element=element;
            this.next=null;
            this.previous=null;
        };
        var head=new Node("head");
        doublyLinkedList.find=function (item) {
            var currNode=head;
            while (currNode.element!=item){
                currNode=currNode.next;
            }
            return currNode;
        };
        doublyLinkedList.insert=function (newElement,item) {
            var newNode=new Node(newElement);
            var current=this.find(item);
            newNode.next=current.next;
            newNode.previous=current;
            current.next=newNode;
        };
        doublyLinkedList.remove=function (item) {
            var currNode=this.find(item);
            if(!(currNode.next==null)){
                currNode.previous.next=currNode.next;
                currNode.next.previous=currNode.previous;
                currNode.next=null;
                currNode.previous=null;
            }
        };
        doublyLinkedList.findLast=function () {
            var currNode=head;
            while(!(currNode.next==null)){
                currNode=currNode.next;
            }
            return currNode;
        };
        doublyLinkedList.display=function () {

        };
        doublyLinkedList.dispReverse=function () {
            // var currNode=head;
            // currNode=this.findLast();
            // while (!(currNode.previous==null)){
            //     currNode=currNode.previous;
            // }
        };
        return doublyLinkedList;
    };
    return {
        getInstance:createNew
    };
});