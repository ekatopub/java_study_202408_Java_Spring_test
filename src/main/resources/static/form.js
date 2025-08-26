'use strict';

/** 画面ロード時の処理 */
jQuery(function($){

    /** ボタンを押したときの処理 */
    $('#rest_button').click(function(event) {
        
        // フォームの値を取得
        var formData = $('#sample_form').serializeArray();

        // ajax通信
        $.ajax({
            type : 'POST',
            cache : false,
            url : '/form/rest',
            data: formData,
            dataType : 'json',
        }).done(function(data) {

            // ajax成功時の処理

            // ajax通信の戻り値から、pタグのメッセージを作成。
            var new_element = document.createElement('p');
            new_element.textContent = data.resultStr;

            // pタグの挿入位置を取得（id="rest_button"の位置を取得）
            var element = document.getElementById('rest_button');

            // 取得した位置にpタグを挿入
            element.after(new_element);
        
        }).fail(function(jqXHR, textStatus, errorThrown) {
			}).always(function() {
			            // 常に実行する処理

			        });
			    });
			});