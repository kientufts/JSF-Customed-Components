function onSelectedTab(title){
    var icon=title.firstElementChild;
    var parent=title.parentNode;
    var p=parent.childNodes[3];
    if(title.className=="selected-panel"){
        title.className="";
        icon.innerHTML="+";
        p.style.display="none";
    } else {
        title.className="selected-panel";
        icon.innerHTML="-";
        p.style.display="block";
    }
}