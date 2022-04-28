/*
Copyright (c) 2003-2010, CKSource - Frederico Knabben. All rights reserved.
For licensing, see LICENSE.html or http://ckeditor.com/license
*/

CKEDITOR.editorConfig = function( config )
{
	// Define changes to default configuration here. For example:
	config.toolbar_Full = 
		[
		 ['Format','Font','FontSize'],['Bold','Italic','Underline','Strike'],['NumberedList','BulletedList'],['JustifyLeft','JustifyCenter','JustifyRight','JustifyBlock'],['TextColor','BGColor'],['Print']
		 ];
	config.height = 353;
	config.width = '100%'
	config.resize_enabled = false;
};
