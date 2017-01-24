// tableClass  table样式名称
// url:访问请求地址
// aoColumns 列名对应
// map 查询参数
var query = function (tableClass, url, aoColumns, map) {
    $(tableClass).dataTable({
        "bPaginate": true,// 分页按钮
        "bFilter": false,// 搜索栏
        "bLengthChange": true,// 每行显示记录数
        "iDisplayLength": 10,// 每页显示行数
        "bSort": false,// 排序
        "bInfo": true,//
        "bWidth": true,
        "bScrollCollapse": true,
        "sPaginationType": "full_numbers", // 分页，一共两种样式 另一种为two_button // 是datatables默认
        "bProcessing": true,
        "bServerSide": true,
        "bDestroy": true,
        "bSortCellsTop": true,
        "sAjaxSource": url,
        "aoColumns": aoColumns,
        "columnDefs": [
            {
                "targets": 0,
                "data": "download_link",
                "render": function (data, type, full, meta) {
                    return '<input type="checkbox"  class="comm_check" id="checkbox" />';
                }
            }],


        "fnServerData": function (sSource, aoData, fnCallback) {
            aoData.push({"name": "param", "value": map});
            $.ajax({
                "type": 'post',
                "url": sSource,
                "dataType": "json",
                "data": {
                    aoData: JSON.stringify(aoData)
                },
                "success": function (resp) {
                    fnCallback(resp);
                }
            });

        }

    });
}