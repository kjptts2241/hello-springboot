$(document).ready(function(){
    $.getJSON("/movie", function(result){
        var html
        $.each(result, function(i, field){
            //console.log(field);
            html += `<div class="col-lg-4 col-sm-6">
                            <a href="#galleryModal" class="gallery-box" data-toggle="modal" data-src="\${field}">
                            <img src="\${field}" class="img-responsive" alt="Image 1">
                            <div class="gallery-box-caption">
                                <div class="gallery-box-content">
                                    <div>
                                        <i class="icon-lg ion-ios-search"></i>
                                    </div>
                                </div>
                            </div>
                            </a>
                         </div>`;
            // var html = "<a href='" + field.link + "'>" + field.title + "<br>"
        });
        $("#movielist").html(html);
    });
});
