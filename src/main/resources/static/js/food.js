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
        var name = $("#name").val();
        var img = $("#img").val();
        if(name == "" || img == "") {
            alert("내용을 입력해주세요");
            return;
        }
        var data = {
            name: name,
            img: img
        };
        $.ajax({
            type: 'POST',
            url: '/api/v1/foodsave',
            dataType: 'json',
            contentType: 'application/json; charset-utf-8',
            data: JSON.stringify(data)
        }).done(function (data) {
            if (data == null) {
                alert("메뉴를 추가 실패\n관리자에게 문의");
             } else {
                alert("메뉴를 추가 했습니다");
             }
            window.location.href = '/foodlist';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }

};

main.init();