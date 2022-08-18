var main = {
    init : function () {
        var _this = this;
        $("#myBtn").click(function(){
            $("#myModal").modal();
        });
        $('#addBtn').on('click', function () {
            _this.save();
        });
    },
    save : function () {
        var data = {
            menuname: $("#menuname").val(),
            imgsrc: $("#imgsrc").val()
        };
        $.ajax({
            type: 'POST',
            url: '/api/v1/foodsave',
            dataType: 'json',
            contentType: 'application/json; charset-utf-8',
            data: JSON.stringify(data)
        }).done(function (data) {
            if (data == 1) {
                alert("메뉴를 추가 했습니다");
            } else {
                alert("메뉴를 추가 실패\n관리자에게 문의");
            }
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }

};

main.init();