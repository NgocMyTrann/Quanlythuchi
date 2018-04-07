namespace ThuChi.Models
{
    using System;
    using System.Data.Entity;
    using System.ComponentModel.DataAnnotations.Schema;
    using System.Linq;

    public partial class DbQly : DbContext
    {
        public DbQly()
            : base("name=DbQly")
        {
        }

        public virtual DbSet<ThuChiCSDL> ThuChiCSDLs { get; set; }

        protected override void OnModelCreating(DbModelBuilder modelBuilder)
        {
            modelBuilder.Entity<ThuChiCSDL>()
                .Property(e => e.Sotien)
                .HasPrecision(18, 0);
        }
    }
}
