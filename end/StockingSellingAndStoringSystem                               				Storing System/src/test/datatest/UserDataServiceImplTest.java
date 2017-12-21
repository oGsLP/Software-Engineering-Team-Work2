package test.datatest;

import objects.ResultMessage;
import org.junit.Test;
import po.UserPO;
import service.dataservice.Impl.UserDataServiceImpl;
import service.dataservice.UserDataService;

import static junit.framework.TestCase.assertEquals;

public class UserDataServiceImplTest {
    UserDataService userDataService = new UserDataServiceImpl();
    UserPO po = new UserPO("销售人员", "销售人员1", "1" );
    @Test
    public void add() throws Exception {
        ResultMessage msg = userDataService.add(po);
        assertEquals(ResultMessage.Success, msg);
    }

    @Test
    public void delete() throws Exception {
        ResultMessage msg = userDataService.delete(po);
        assertEquals(ResultMessage.Success, msg);
    }

    @Test
    public void update() throws Exception {
        po.setPassword("1");
        ResultMessage msg = userDataService.update(po);
        assertEquals(ResultMessage.Success, msg);
    }

    @Test
    public void find() throws Exception {
        UserPO po1 = userDataService.find("销售人员1");
        assertEquals(po1.getPassword(), "1");
    }

    @Test
    public void contains() throws Exception {

    }

}