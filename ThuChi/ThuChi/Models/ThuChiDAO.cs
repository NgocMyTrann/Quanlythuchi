using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace ThuChi.Models
{
    //mục đích của class này là lấy các dữ liệu từ database lên
    public class ThuChiDAO
    {
        private DbQly db;

        public ThuChiDAO()
        {
            db = new DbQly();
        }

        public IEnumerable<ThuChiCSDL> ListAll()
        {
            return db.ThuChiCSDLs.OrderByDescending(s => s.ID);
        }
        public ThuChiCSDL GetByID(long id)
        {
            return db.ThuChiCSDLs.Find(id);
        }
        public long Insert(ThuChiCSDL obj)
        {
            db.ThuChiCSDLs.Add(obj);
            db.SaveChanges();
            return obj.ID;
        }

        public bool Update(ThuChiCSDL obj)
        {
            try
            {
                var thuChi = db.ThuChiCSDLs.Find(obj.ID);
                thuChi.Ten = obj.Ten;
                thuChi.Sotien = obj.Sotien;
                thuChi.Ngay = obj.Ngay;

                db.SaveChanges();
                return true;
            }
            catch (Exception)
            {
                return false;
            }
        }
        public bool Delete(long id)
        {
            try
            {
                var thuChi = db.ThuChiCSDLs.Find(id);
                db.ThuChiCSDLs.Remove(thuChi);
                db.SaveChanges();
                return true;
            }
            catch (Exception)
            {
                return false;
            }
        }
    }
}