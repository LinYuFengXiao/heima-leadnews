package com.heima.minio.test;


import com.heima.file.service.FileStorageService;
import com.heima.minio.MiniOApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

@SpringBootTest(classes = MiniOApplication.class)
@RunWith(SpringRunner.class)
public class MiniOTest {

    @Autowired
    private FileStorageService fileStorageService;

    //把list.html文件上传到minio中，并且可以在浏览器中访问
    @Test
    public void test() throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("e:\\list.html");
        String path = fileStorageService.uploadHtmlFile("", "list.html", fileInputStream);
        System.out.println(path);

    }



    /*
    *//**
     * 把list.html文件上传到minio中，并且可以在浏览器中访问
     * @param args
     *//*
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("e:\\list.html");

            //1.获取minio的链接信息，创建一个minio的客户端
            MinioClient minioClient = MinioClient.builder().credentials("minioadmin", "svrPZWpAYbHZrXZ2").endpoint("http://172.18.70.148:9000").build();


            //2.上传
            PutObjectArgs putObjectArgs = PutObjectArgs.builder()
                    .object("list.html")//文件名称
                    .contentType("text/html")//文件类型
                    .bucket("leadnews")//桶名称
                    .stream(fileInputStream, fileInputStream.available(), -1).build();
            minioClient.putObject(putObjectArgs);

            //访问路径
            System.out.println("http://172.18.70.148:9000/leadnews/list.html");

        } catch (Exception e) {
            e.printStackTrace();
        }



    }*/


}
