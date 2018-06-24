function loadData(panel){
    if((panel.scrollTop+panel.clientHeight)>=panel.scrollHeight){
        document.getElementById("form:data-loader").click();
    }
}

function ajaxEvent(data) {
    var status = data.status;
    if(status=="begin"){
        document.getElementById("ajax-loader").style.display="block";
    } else if(status =="complete"){
        document.getElementById("ajax-loader").style.display="none";
    }
}