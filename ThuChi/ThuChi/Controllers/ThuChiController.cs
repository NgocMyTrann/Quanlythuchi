using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Net.Http;
using System.Web.Http;
using ThuChi.Models;

namespace ThuChi.Controllers
{
    public class ThuChiController : ApiController
    {
        // GET api/values
        public IEnumerable<ThuChiCSDL> Get()
        {
            return new ThuChiDAO().ListAll();
        }

        // GET api/values/5
        public ThuChiCSDL Get(int id)
        {
            return new ThuChiDAO().GetByID(id);
        }

        // POST api/values
        public long Post([FromBody]ThuChiCSDL obj)
        {
            long res = new ThuChiDAO().Insert(obj);
            return res;
        }

        // PUT api/values/5 //sua dl
        public string Put(int id, [FromBody]ThuChiCSDL obj)
        {
            obj.ID = id;
            bool res = new ThuChiDAO().Update(obj);
            if (res)
            {
                return "success";
            } else return "failed";
        }
   
        // DELETE api/values/5
        public string Delete(int id)
        {
            bool res = new ThuChiDAO().Delete(id);
            if (res)
            {
                return "success";
            }
            else return "failed";

        }
    }
}
