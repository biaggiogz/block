//package com.block.projectblock.services;
//
//import com.block.projectblock.model.MBlockNosql;
//import com.block.projectblock.repository.RepositoryMBlockNosql;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
//import org.springframework.stereotype.Component;
//
//import java.security.cert.CertPath;
//import java.sql.Timestamp;
//import java.util.Date;
//import java.util.List;
//
//@Component
//@EnableMongoRepositories(basePackageClasses = RepositoryMBlockNosql.class)
//public class ApplicationCommandRunner implements CommandLineRunner {
//
//    protected final Log logger = LogFactory.getLog(getClass());
//
//    @Autowired
//    private  RepositoryMBlockNosql rpmongoDB ;
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        logger.info("Welcome to the runner from commandLineRunner to test JPA mapping 1:n");
//        logger.info("Data creation Mblock started...");
//
////        java.sql.Timestamp start = new java.sql.Timestamp(System.currentTimeMillis());
////        rpmongoDB.save(new MBlockNosql("155446466","11121"));
////
////        java.sql.Timestamp finish = new java.sql.Timestamp(System.currentTimeMillis());
////
////        logger.info("duration create 20 operation ... (ms)" + (start.getTime() - finish.getTime()));
////        logger.info("Data creation Employee complete...");
//
//       List<MBlockNosql> mblocks = rpmongoDB.findAll();
//       logger.info("Data mblock query get " + mblocks);
//       logger.info("mblocks count: " + mblocks.stream().count());
//
////        Timestamp startCreate = new Timestamp(System.currentTimeMillis());
////        rpmongoDB.save(new MBlockNosql("528885858","7852"));
////        Timestamp finishCreate = new Timestamp(System.currentTimeMillis());
//
//
//
//
//    }
//
//}
