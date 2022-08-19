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
            console.log(data);
            // $("#news").html("");
             $.each(data, function (i, field) {
                  var html = "제목 : " + field.title +  "<br><br>"
                      + field.description + "<br><br><br>"
                      + "<a href='" + field.link + "'>링크</a><br>"
                      + field.pubDate + "<br><br><br><br><br>"
                  $("#news").append(html);
              });
            //window.location.href = '/';
        }).fail(function (error) {
            alert(JSON.stringify(error));
        });
    }

};

main.init();