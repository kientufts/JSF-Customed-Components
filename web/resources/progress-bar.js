function ajax(data) {
    var status = data.status;
    if(status=="begin"){
        setInterval(function(){
            var progressValue = document.getElementById("progress").innerText;
            if(progressValue!='100%'){
                document.getElementById("form:refresh").click();
            }
        }, 100);
    }
}