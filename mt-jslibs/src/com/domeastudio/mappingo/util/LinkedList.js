/**
 * Created by Administrator on 2016/5/6 0006.
 */
define("com/domeastudio/mappingo/util/LinkedList",[],function () {
    var createNew=function(){
        var linkedList={};
        var Node=function(element){
            this.element=element;
            this.next=null;
        };
        var head=new Node('head');
        linkedList.find=function (item) {
            var currNode=head;
            while(currNode.element!=item){
                currNode=currNode.next;
            }
            return currNode;
        };
        linkedList.insert=function (newElement,item) {
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
        linkedList.remove=function (item) {
            var prevNode=findPrevious(item);
            if(!(prevNode.next==null)){
                prevNode.next=prevNode.next.next;
            }
        };
        linkedList.display=function () {

        };
        return linkedList;
    };
    return {
        getInstance:createNew
    };
});