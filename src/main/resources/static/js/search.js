var main = {
    init : function () {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.news();
        });
    },

    news : function () {
        var data = {
            search: $('#search').val()
        };
        $.ajax({
            type: 'POST',
            url: '/api/v1/saveOrNews',
            dataType: 'json',
            contentType: 'application/json; charset-utf-8',
            data: JSON.stringify(data)
        }).done(function (data) {
            //alert('검색어 저장 + 뉴스 검색 결과 입니다');
            $("#news").html("");
            $.each(data.items, function (i, field) {
                var html = "<a href='" + field.link + "'>" + field.title + "<br>"
                $("#news").append(html);
            });
            //window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }

};

main.init();