package com.s;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import sun.net.ftp.FtpClient;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class UploadContoller {
    @Value("${ftp_address}")
    private String  ip;
    @Value("${ftp_port}")
    private int port;
    @Value("${ftp_username}")
    private String username;
    @Value("${ftp_password}")
    private String password;
    @Value("${ftp_workdirectory}")
    private String path;
    @RequestMapping("show")
    public String query(){
        return "file";
    }
    @PostMapping("upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile file){
      String fileName= file.getOriginalFilename();
      System.out.println("文件名:"+fileName);
      String flag="";
      try {
          InputStream inputStream = file.getInputStream();//spring提供的文件流
         flag= connectFTP(ip,port,username,password,path,fileName,inputStream);
      }catch(IOException e){
          e.printStackTrace();
      }

        return flag;

    }
    public String connectFTP(String ip,Integer port,String username,String password,String path,String filename,InputStream inputStream){
        //连接ftp
        FTPClient  ftpClient= new FTPClient();
        try {
            ftpClient.connect(ip, port);//连接ftp
            ftpClient.login(username, password);//ftp 用户名和密码
            //测试连接是否成功  200-300之间   说明连接成功 否则连接失败
           int code= ftpClient.getReplyCode();
           System.out.println("响应码是"+code);
           if(!FTPReply.isPositiveCompletion(code)){
              ftpClient.disconnect();
           }
            //设置文件上传路径
            ftpClient.changeWorkingDirectory(path);
           //设置上传二进制文件
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            //真正保存的ftp服务器
            boolean flag=ftpClient.storeFile(filename,inputStream);
           if(flag){

               return "success" ;
           }
           else{
               return "error";
           }
        }
        catch (Exception e){
            e.printStackTrace();
        }finally {
            try{
            ftpClient.disconnect();}
            catch (Exception e){
                e.printStackTrace();
            }
        }
        return "";
    }
}
