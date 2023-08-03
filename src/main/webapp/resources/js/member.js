console.log("member");

const id = document.getElementById("id");
const pw = document.getElementById("pw");

//---- ID Check-----
//비어X, 최대 10
id.addEventListener("blur", function(){
    const idResult = document.getElementById(id.id+"Result")
    console.log(idResult);
    

    if(id.value == "" || id.value.length>10){
        console.log("xxxxxx");
        idResult.innerHTML="ID는 비어있으면 X, 10글자 미만이어야 한다";
        idResult.className="f";
    }else {
        console.log("ok");
        idResult.innerHTML="가능한 ID입니다.";
        idResult.className="s";
    }
});

//-----------------------------



//---------- PW check
pw.addEventListener("blur", function(){
    const pwResult = document.getElementById(pw.id+"Result")
    if(pw.value.length>5 && pw.value.length<12){
        pwResult.innerHTML="올바른 비번입니다";
        pwResult.className="s";
    }else {
        pwResult.innerHTML="비번은 6글자 이상 12글자 미만이어야 함";
        pwResult.className="f";
    }
})