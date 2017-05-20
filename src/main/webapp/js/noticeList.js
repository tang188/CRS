/**
 * notice fenye
 */
$(function(){	
	noticeListConfig.init();
});

var noticeListConfig = (function(){
	var currentObj = null;

	return {
		init: function(){
			currentObj = this;
			this.generateZPXXView();
		},

		generateZPXXView:function(){
			//初始化
			var pageSize = 5;
			var pageIndex=0;
			renderView(1,pageSize);

			var totalPages = Math.ceil(totalCount/pageSize);
			var count = 1;
			$("#preBtn").click(function(){
				if(count>1){
					count--;
					renderView(count,pageSize);
				}
			});

			$("#nextBtn").click(function(){
				if(count<totalPages){
					count++;
					renderView(count,pageSize);
				}
			});

			function renderView(pageIndex,pageSize){
				$.ajax({
		            type: "POST",
		            url: "/notice/findNoticesByPage.do",
		            data:"pageIndex="+pageIndex+"&pageSize="+pageSize,
		            success: function(data) {
		               if(data){
		               		var conStr ='<table class="table" >' + '<tr><td>序号</td><td>标题</td><td>发布时间</td></tr>';
		               		for(var i=0;i<data.length;i++){
		               			conStr += '<tr>' +	
		               			'<td>'+data[i].nid +'</td>'+
		               			'<td>'+data[i].title+'</td>'+
		               			'<td>'+data[i].time+'</td>'+
		               			'<td ><a href="/notice/showDetail.do?'+data[i].nid+'/>">查看</a></td>'
		               			'</tr>';
		               		}
		               		conStr +='</table>'
		               		$("#zpxxView").html(conStr);
		               }
		            },
		            error: function(jqXHR, textStatus, errorThrown) {
		                alert(jqXHR.status + " : " + jqXHR.statusText);
		            }
		        });
		    }
		}
	};
})();