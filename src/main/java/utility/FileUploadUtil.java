package utility;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import com.bizz.entity.Entities;
import com.bizz.service.EntityService;

import exception.ResourceNotFoundException;


public class FileUploadUtil {
			
	 public static String saveFile(String fileName, MultipartFile multipartFile,String name,String fy)
	            throws IOException, ResourceNotFoundException {

	        Path uploadPath = Paths.get("uploads/"+name+'/'+fy);
	          
	        if (!Files.exists(uploadPath)) {
	            Files.createDirectories(uploadPath);
	        }
	        	         
	        try (InputStream inputStream = multipartFile.getInputStream()) {
	            Path filePath = uploadPath.resolve(fileName);
	            Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
	        } catch (IOException ioe) {       
	            throw new IOException("Could not save file: " + fileName, ioe);
	        }
	         
	        return fileName;
	    }

}
