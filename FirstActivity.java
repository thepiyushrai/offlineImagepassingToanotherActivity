  private MyPojo submitted_data;
   //MyPojo is table name
 submitted_data = dbHelper.getMyInfo().queryBuilder().where().eq("auto_id", id).queryForFirst();

 byte[] byteArray = getIntent().getByteArrayExtra("startreadingimages");
        if (byteArray != null) {
            sbm = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            start.setImageBitmap(sbm);
        }