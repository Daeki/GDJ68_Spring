
let del = document.getElementById("del");

let bookNum;

//1. 함수 사용
function setBookNum(num){
    bookNum=num;
}

del.addEventListener("click", function(){
    let result = confirm("삭제 할거냐???");
    if(result){
        console.log(del.id)
        console.log(del.getAttribute("data-delete-num"));
        bookNum=del.getAttribute("data-delete-num")
        let parameterName=del.getAttribute("data-delete-name");

        location.href="./delete?"+parameterName+"="+bookNum;
    }
});