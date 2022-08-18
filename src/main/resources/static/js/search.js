var main = {
    init : function () {
        var _this = this;
        $('#btn-save').on('click', function () {
            _this.save();
            _this.news();
        });
    },
    save : function () {
        var data = {
            search: $('#search').val()
        };
        $.ajax({
            type: 'POST',
            url: '/api/v1/search',
            dataType: 'json',
            contentType: 'application/json; charset-utf-8',
            data: JSON.stringify(data)
        }).done(function () {
            //alert('검색 결과가 저장 되었습니다');
            //window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    },

    news : function () {
        var data = {
            search: $('#search').val()
        };
        $.ajax({
            type: 'POST',
            url: '/api/v1/news',
            dataType: 'json',
            contentType: 'application/json; charset-utf-8',
            data: JSON.stringify(data)
        }).done(function (data) {
            //alert('뉴스 검색 결과 입니다');
            $("#news").html("");
            $.each(data.items, function (i, field) {
                var html = "[   " + "<a href='" + field.link + "'>" + field.title + "   ]" + "<br>"
                $("#news").append(html);
            });
            //window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }

};

main.init();