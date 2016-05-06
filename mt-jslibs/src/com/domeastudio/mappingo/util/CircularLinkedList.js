/**
 * Created by Administrator on 2016/5/6 0006.
 */
define("com/domeastudio/mappingo/util/CircularLinkedList",[],function () {
    var createNew=function(){
        var circularLinkedList={};
        var Node=function(element){
            this.element=element;
            this.next=null;
        };
        var head=new Node('head');
        head.next=head;
        circularLinkedList.find=function (item) {
            var currNode=head;
            while(currNode.element!=item){
                currNode=currNode.next;
            }
            return currNode;
        };
        circularLinkedList.insert=function (newElement,item) {
            var newNode=new Node(newElement);
            var current=this.find(item);
            newNode.next=current.next;
            current.next=newNode;
        };
        var findPrevious=function(item){
            var currNode=head;
            while (!(currNode.next==null)&&(currNode.next.element!=item)){
                currNode=currNode.next;
            }
            return currNode;
        };
        circularLinkedList.remove=function (item) {
            var prevNode=findPrevious(item);
            if(!(prevNode.next==null)){
                prevNode.next=prevNode.next.next;
            }
        };
        circularLinkedList.display=function () {

        };
        return circularLinkedList;
    };
    return {
        getInstance:createNew
    };
});