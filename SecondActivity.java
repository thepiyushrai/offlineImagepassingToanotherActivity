



 byte[] byteArray = getIntent().getByteArrayExtra("startreadingimages");
        if (byteArray != null) {
            sbm = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            start.setImageBitmap(sbm);
        }


        //start is imageView